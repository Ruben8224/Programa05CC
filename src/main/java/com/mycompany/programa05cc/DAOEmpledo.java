package com.mycompany.programa05cc;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author ruben
 */
public class DAOEmpledo implements IDAOGeneral<Empleado, Long> {

    @Override
    public Empleado create(Empleado p) {

        try ( Session session = HibernateUtil.getSession()) {

            Transaction t = session.beginTransaction();

            session.save(p);
            Logger.getLogger(DAOEmpledo.class.getName()).log(Level.INFO, "Se guardo Empleado");

            t.commit();
       

        } catch (HibernateException ex) {
            Logger.getLogger(DAOEmpledo.class.getName());

        }
        return p;
    }

    @Override
    public boolean delete(Long id) {

        boolean b = false;

        Empleado empleadoo = findByID(id);

        try ( Session session = HibernateUtil.getSession()) {

            Transaction t = session.beginTransaction();

            if (empleadoo != null) {
                session.delete(empleadoo);
                Logger.getLogger(DAOEmpledo.class.getName()).log(Level.INFO, "Se elimino Empleado");
                b = true;
            } else {
                return b;
            }

        } catch (HibernateException ex) {
            Logger.getLogger(DAOEmpledo.class.getName());
        }

        return b;
    }

    @Override
    public Empleado update(Long id, Empleado p) {

        try ( Session session = HibernateUtil.getSession()) {

            Transaction t = session.beginTransaction();

            Empleado empleado = findByID(id);
            if (empleado != null) {
                session.update(empleado);
                Logger.getLogger(DAOEmpledo.class.getName()).log(Level.INFO, "Se actualizo Empleado");
            }

            t.commit();
            session.close();

        } catch (HibernateException ex) {
            Logger.getLogger(DAOEmpledo.class.getName());
        }

        return p;

    }

    @Override
    public List<Empleado> findAll() {
        List<Empleado> empleados = null;
        try ( Session session = HibernateUtil.getSession()) {
            Transaction t = session.beginTransaction();

           // List<Empleado> lstRes=
             //       Session.
            empleados = session.createQuery("FROM Empleado").list();
            t.commit();
            session.close();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOEmpledo.class.getName());
        }
        return empleados;
    }

    @Override
    public Empleado findByID(Long id) throws IllegalArgumentException, HibernateException {
        if (id == null || id == 0) {
            throw new IllegalArgumentException("El argumento id no puede ser nulo o cero");
        }

        Empleado empleado = null;

        try (Session session = HibernateUtil.getSession()) {
            Transaction t = session.beginTransaction();

            empleado = session.get(Empleado.class, id);

            t.commit();
        } catch (HibernateException ex) {
            Logger.getLogger(DAOEmpleado.class.getName()).log(Level.SEVERE, "Error al buscar el Empleado por ID", ex);
            throw ex;
        }

        return empleado;
        
        
        
        
        

//        Empleado empleado = null;
//
//        try ( Session session = HibernateUtil.getSession()) {
//            Transaction t = session.beginTransaction();
//
//            empleado = session.get(Empleado.class, id);  //Original            
//
//            t.commit();
//            session.close();
//
//        } catch (HibernateException ex) {
//            Logger.getLogger(DAOEmpledo.class.getName());
//        }
//
//        return empleado;
    }    

}