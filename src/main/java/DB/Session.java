package DB;


import java.util.List;

public interface Session {

     void save (Object entity);
     Object get (Class myClass, int id);
     void update (Object entity, int id);
     void delete (Object entity, int id);
     List<Object> findAll (Class myClass);
     void close();

}
