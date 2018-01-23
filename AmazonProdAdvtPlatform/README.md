Refactor
In FetchFromPropertyFile.java instead of returning empty Nodestats object create a nullNodestats objetc. Follow Null objetcp attern for it
In RootNode.java loadLdapChildren() in the while loop create and load childNodes with only one child at a time and break out of loop. Check if childNodes doesn't contains the child already then add it to the list and process it
In LoadLeafChildren.java loadRequiredChildren() make sure if the childNodeProperties is already loaded with same file no need to reload it with same file
