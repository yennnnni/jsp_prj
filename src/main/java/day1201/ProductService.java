package day1201;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ProductService {
		
	public List<ProductDTO> searchPrd(){
		List<ProductDTO> list = new ArrayList<ProductDTO>();

		list.add(new ProductDTO("img_1.jpg", "뭐지?", "넌 아냐?", 3500, new Date()));
		list.add(new ProductDTO("img_2.jpg", "몰루?", "아는가?", 23500,
				new Date(System.currentTimeMillis() - (60 * 60 * 24 * 1))));
		list.add(new ProductDTO("img_3.jpg", "이건 못참지?", "수고용 퇴근ㄱㄱ", 500,
				new Date(System.currentTimeMillis() - (60 * 60 * 24 * 1))));
		return list;
	}//searchPrd
}//ProductService
