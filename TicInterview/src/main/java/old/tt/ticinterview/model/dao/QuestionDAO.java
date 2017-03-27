package old.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.form.Question;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 10/03/2017.
 */
@Repository(value = "QuestionDAO")
public class QuestionDAO implements CrudDAO<Question>{
    public Question getById(Long id){
        return entityManager.find(Question.class,id);
    }

    public List<Question> getAll(){
        String prepareQuery = "select something from Question something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
}
