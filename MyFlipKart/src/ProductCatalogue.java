import java.io.*;
import java.util.*;

public class ProductCatalogue implements Searchable {
	private HashMap<String, ArrayList<Product>> categoryProductMap;

	private ArrayList<Product> products;
	private ArrayList<Category> categories;

	@Override
	public ArrayList<Product> searchCategoryProducts(String categoryName) {
		return categoryProductMap.get(categoryName);
	}

}
