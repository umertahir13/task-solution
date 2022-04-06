package service;

import model.Product;

import java.util.ArrayList;
import java.util.Collection;

public class ProductFilterServiceImplementation implements ProductFilterService
{
    @Override
    public Collection<Product> filterProductsByName(Collection<Product> products, String name)
    {
    	Collection collection = new ArrayList<>();
    	for (Product product : products) {
    		
    		if(product.getName().toString() == name) {
    			collection.add(product);
    		}
		}
        return collection;
    }

    @Override
    public Collection<Product> filterProductsByField(Collection<Product> products, String field, String value)
    {
    	Collection collection = new ArrayList<>();
    	for (Product product : products) {
    		
    		if(product.getCategory().toString() == value) {
    			collection.add(product);
    		}
		}
        return collection;
    }
    
    
}
