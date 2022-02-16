/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import model.Contact;

/**
 *
 * @author cgpre
 */
public class ContactService {

    List<Contact> listaContatos;

    public ContactService(){
        listaContatos = new ArrayList<>();
    }
    
    
    public void populate() {

        listaContatos.add(new Contact(1, "Sara", "sara@email.com", "556299991129", "Rua 1", "Anápolis"));

        listaContatos.add(new Contact(2, "Pedro", "pedro@email.com", "556299584146", "Rua 1", "Anápolis"));
        listaContatos.add(new Contact(3, "Mary", "mary@email.com", "556189682142", "Rua 1", "Brasilia"));
    }

    public Contact getContactById(long id) {
        for (Contact next : listaContatos) {
            if (next.getId()==id){
                return next;
            }
        }

        return null;
    }
    public boolean containsId(long id) {
        for (Contact next : listaContatos) {
            if (next.getId()==id){
                return true;
            }
        }

        return false;
    }
    public void add(Contact c){
        listaContatos.add(c);
    }
    public void rem(Contact c){
        listaContatos.remove(c);
    }

}
