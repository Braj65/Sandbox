package pack.test;

import static org.elasticsearch.common.xcontent.XContentFactory.jsonBuilder;

import java.net.InetAddress;

import org.elasticsearch.action.admin.indices.create.CreateIndexRequest;
import org.elasticsearch.action.admin.indices.mapping.put.PutMappingResponse;
import org.elasticsearch.action.get.GetResponse;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.elasticsearch.common.xcontent.XContentBuilder;

import com.amazon.elastic.entity.RequestEntity;
import com.amazon.elastic.entity.SearchResult;
import com.fasterxml.jackson.databind.ObjectMapper;

public class ElasticTest {
    public static void main(String[] args) throws Exception {
	Settings settings = Settings.settingsBuilder().put("cluster.name", "myAZCluster").build();
	TransportClient client = TransportClient.builder().settings(settings).build()
		.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9300))
		.addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName("localhost"), 9301));
	
	XContentBuilder mapping = jsonBuilder().startObject()
		.startObject("tweet2")
		.startObject("properties")
		.startObject("ASIN").field("type", "string").field("index", "not_analyzed").endObject()
		.startObject("averagePrice").field("type", "double").field("index", "not_analyzed").endObject()
		.startObject("currentPrice").field("type", "double").field("index", "not_analyzed").endObject()
		.startObject("minPrice").field("type", "double").field("index", "not_analyzed").endObject()
		.endObject()
		.endObject()
		.endObject();
		/*.field("type", "string").field("type", "integer")
		.field("type", "integer").field("type", "integer").endObject();*/
	
	client.admin().indices().create(new CreateIndexRequest("twitterx")).actionGet();
	PutMappingResponse mapResponse = client.admin().indices().preparePutMapping("twitterx").setType("tweet2")
		.setSource(mapping).execute().actionGet();
	// String json = builder.string();
	
	ObjectMapper mapper = new ObjectMapper();
	RequestEntity req = new RequestEntity();
	req.setASIN("XXXX");
	req.setCurrentPrice(135.00);
	req.setAveragePrice(136.00);
	req.setMinPrice(130.00);
	byte[] json = mapper.writeValueAsBytes(req);
	IndexResponse resp = client.prepareIndex("twitterx", "tweet2", "1").setSource(json).get();
	GetResponse getResp = client.prepareGet("twitterx", "tweet2", "1").get();
	SearchResult res = mapper.readValue(getResp.getSourceAsBytes(), SearchResult.class);
	
	System.out.println();
    }
}
