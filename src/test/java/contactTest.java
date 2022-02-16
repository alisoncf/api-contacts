
import com.google.gson.Gson;
import javax.json.Json;
import service.ContactService;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author cgpre
 */
public class contactTest {
    public static void main(String[] args){
        ContactService service = new ContactService();
        service.populate();
        Gson gson = new Gson();
        
        System.out.println(  gson.toJson(service.getContactById(1)));
    }
}
