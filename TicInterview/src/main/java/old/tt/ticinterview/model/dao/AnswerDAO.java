package old.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Answer;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Tictum on 14/03/2017.
 */
@Repository("AnswerDAO")
public class AnswerDAO implements CrudDAO<Answer> {
    @Override
    public Answer getById(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Answer> getAll() {
        return null;
    }

    public void valorationAnswer(long idAnswer, int valoration){

    }
}