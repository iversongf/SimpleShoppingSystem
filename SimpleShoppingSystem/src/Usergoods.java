package SimpleShoppingSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

import net.sf.json.JSONObject;

public class Usergoods<Goods> {
	private String name1;
	private float price;
	private String photo;
	private int number;
	private String Id;
	
	public String getName1() {
		return name1;
	}
	public void setName1(String name1) {
		this.name1 = name1;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public void savegoods(){
		HashMap map=new HashMap();
		map.put("ID", this.Id);
		map.put("Name1", this.name1);
		map.put("Price", this.price);
		map.put("Photo", this.photo);
		JSONObject json=new JSONObject();
		json=json.fromObject(map);
		String str=json.toString();
		try {
			FileWriter writer=new FileWriter("goods.json",true);
			writer.write(str);
			writer.write("\r\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public Usergoods getgoodID(String ID) {
		FileReader reader;
		try {
			reader=new FileReader("goods.json");
			BufferedReader br=new BufferedReader(reader);
			String str;
			try {
				while((str=br.readLine())!=null) {
					JSONObject jsonobj=new JSONObject();
					jsonobj=jsonobj.fromObject(str);
					String jso=jsonobj.getString("ID").toString();
					if(ID.equals(jso)){
						this.Id=jso;
						this.name1=jsonobj.get("Name1").toString();
						this.photo=jsonobj.get("Photo").toString();
						this.price=Float.parseFloat(jsonobj.getString("Price"));
						return (Usergoods) this;
					}
				}
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
