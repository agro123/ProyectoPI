package dvdrental;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class ControladorCategory {
     public static int grabarCategory(Category c)
    {
        CategoryDAO categoryDAO = new CategoryDAO();
        int resultado = categoryDAO.grabarCategory(c);
        return resultado; 
    }
     
     public static ArrayList<Category> listadocategorias(String category_id)
    {
        ArrayList<Category> listado;
        listado = new ArrayList();
        CategoryDAO categorias = new CategoryDAO();
        listado = categorias.listadocategorias(category_id);
        return listado; 
    }
         public static int borrarCategory(String category_id)
    {
        CategoryDAO categoryDAO = new CategoryDAO();
        int resultado = categoryDAO.borrarCategory(category_id);
        return resultado; 
    }
        public static int modificarCategory(Category c)
    {
        CategoryDAO categoryDAO = new CategoryDAO();
        int resultado = categoryDAO.modificarCategory(c);
        return resultado; 
    }
}
