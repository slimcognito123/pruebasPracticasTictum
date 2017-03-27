package old.tt.ticinterview.model.dao;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 10/03/2017.
 */
public interface VideoDAO<T> extends CrudDAO<T> {

    public T getById(Long id);

    public List<T> getAll();

    List<T> searchVideo(String nombreVideo);

}
