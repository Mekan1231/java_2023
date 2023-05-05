package demo.dataAccess;

import demo.entity.Category;
//buna interface oluştursaydın daha iyi olurdu. Çünki business katmanı ile bağlantı yaptığın zaman loosly couple olması gerekecek
public class CategoryDao {
	

	public void add(Category category) {
		System.out.println("Kategori eklendi : "+category.getCategoryName());
		
	}

	public void delete(Category category) {
		System.out.println("Kategori silindi : "+category.getCategoryName());
		
	}

	public void update(Category category) {
		System.out.println("Kategori guncellendi : "+category.getCategoryName());
		
	}

}
