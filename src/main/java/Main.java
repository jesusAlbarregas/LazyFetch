
import es.albarregas.beans.CorreoElectronico;
import es.albarregas.beans.Profesor;
import es.albarregas.persistencia.HibernateUtil;
import java.text.ParseException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import org.hibernate.Session;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author jesus
 */
public class Main {

    private Session sesion;

    public static void main(String[] args) throws ParseException {

//        HibernateUtil.buildSessionFactory();

        new Main();
    }

    /**
     * @param args the command line arguments
     */
    public Main() {

        // Los datos se han cargado en las tablas a través de la aplicación MapeoUnoAMuchosDesordenada
        // Abrimos la sesión de Hibernate
        sesion = HibernateUtil.getSessionFactory().openSession();
        

        // Leemos todos los profesores
        List<Profesor> profesores = sesion.createQuery("from Profesor as p left join fetch p.correos").list();
        
        
        // Ahora accedemos a un correo del profesor1
        Iterator<Profesor> itProf = profesores.iterator();
        while(itProf.hasNext()) {
            Profesor profesor = new Profesor();
            profesor = itProf.next();
            
            Iterator<CorreoElectronico> itCorreos = profesor.getCorreos().iterator();
            while(itCorreos.hasNext()) {
                CorreoElectronico correo = new CorreoElectronico();
                correo = itCorreos.next();
                System.out.println(correo.getDireccionCorreo());
            }
        }

        // Cerramos la sesion
        sesion.close();

    }

}
