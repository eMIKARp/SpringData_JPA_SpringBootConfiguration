package pl.mojaaplikacja.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pl.mojaaplikacja.model.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Long>{

	public List<Car> findAllByBrand(String brand);
	public Car findFirstByBrand(String brand);
	public Car findFirstByPrice(double price);
	public List<Car> findFirst3ByBrand(String brand);
	public List<Car> findAllByBrandAndPrice(String brand, double price);
	public List<Car> findAllByBrandOrBrand(String brand1, String brand2);
	public List<Car> findAllByBrandLike(String pattern);
	public List<Car> findAllByNameEndingWith(String pattern);
	public List<Car> findAllByPriceLessThan(double price);
	public List<Car> findAllByPriceBetween(double low, double high);
	public List<Car> findAllByBrandOrderByPriceAsc(String brand);
	public List<Car> findAllByBrandNotNull();
	public List<Car> findAllByNameIn(Collection<String> name); 
}
