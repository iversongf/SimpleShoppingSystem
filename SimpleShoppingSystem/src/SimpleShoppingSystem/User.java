package SimpleShoppingSystem;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.util.HashMap;

import net.sf.json.JSON;
import net.sf.json.JSONNull;
import net.sf.json.JSONObject;


public class User {
       private String name;
       private String password;
       private String email;
       private String cops;
	private Object textField;
	public String getCops() {
		return cops;
	}
	public void setCops(String cops) {
		this.cops = cops;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void saveuser(String name,String ps, String em)
	{
		HashMap map=new HashMap();
    	map.put("username",name);
		map.put("password", ps);
		map.put("E-mail",em );
		JSONObject json=new JSONObject();
		json=json.fromObject(map);
		System.out.println(json);
		String str1=json.toString(); 
		try {
			FileWriter writer=new FileWriter("D://user.json",true);
			writer.write(str1);
			writer.write("\r\n");
			writer.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public boolean Judge(String name,String password1)
	{
		   try {
			FileReader read=new FileReader("D://user.json");
			BufferedReader br=new BufferedReader(read);
			String str;
			while((str=br.readLine())!=null)
			{
				if(str.startsWith("{")){
				JSONObject jsonob=new JSONObject();
				jsonob=jsonob.fromObject(str);
				String readfilename=jsonob.getString("username").toString();
				String readfilepassword=jsonob.getString("password").toString();
				if(name.equals(readfilename)&&password1.equals(readfilepassword))
				{
					return true;
					
				}
			}
		   
			
		} 
		   }catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;	
	}
	
	
	
	
	
	
	
	
	
	
	public boolean usernameregist(String name)
	{
		   try {
			FileReader read=new FileReader("D:/user.json");
			BufferedReader br=new BufferedReader(read);
			String str;
			while((str=br.readLine())!=null)
			{
				if(str.startsWith("{"))
		{
				
				JSONObject jsonob=new JSONObject();
				jsonob=jsonob.fromObject(str);
				String readfilename=jsonob.getString("username").toString();
				
				if(name.equals(readfilename))
				{
					
					return false;
				}
				
				
				
				
		}		
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;	
	}
}

	
