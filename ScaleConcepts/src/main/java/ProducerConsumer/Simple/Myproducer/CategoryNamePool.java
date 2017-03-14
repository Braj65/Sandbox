package ProducerConsumer.Simple.Myproducer;

public class CategoryNamePool extends ObjectPool<String>{

    private String categoryName;
    private boolean enabled;
    public static int cnt=0;
    
    private String[] catNames={"A","B","C"};
    
    
    public CategoryNamePool(String cateName, boolean isEnabled){
	super();
	this.categoryName=cateName;
	this.enabled=isEnabled;
    }
    
    @Override
    public String get() {
	return catNames[cnt++];
    }
    
    @Override
    protected String create() {
	return categoryName;
    }

    @Override
    public boolean validate(String o) {
	return enabled;
    }

    @Override
    public void expire(String o) {
		
    }

}
