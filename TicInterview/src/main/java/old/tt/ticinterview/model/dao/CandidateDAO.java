package old.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.Interview.Interview;
import com.tt.ticinterview.beans.user.Candidate;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 13/03/2017.
 */
@Repository("CandidateDAO")
public class CandidateDAO implements BasicUserDAO<Candidate> {
    public Candidate GetUserMail(String mail) throws Exception {
        String sql = "Select user from Candidate user where user.mail = :mail";
        Query query = entityManager.createQuery(sql);
        query.setParameter("mail", mail);
        return (Candidate) query.getSingleResult();
    }

    @Override
    public void modify(Candidate user) throws Exception {
        entityManager.merge(user);
    }

    @Override
    public Candidate getById(Long id) throws Exception {
        return entityManager.find(Candidate.class,id);
    }

    @Override
    public List<Candidate> getAll() {
        String prepareQuery = "select something from Candidate something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }
    /**
     * 
     * @param candidate
     * @return Invitaciones a entrevista
     */
    public List<Interview> getOwnInterviews(Candidate candidate){
        
        String prepareQuery ="Select Invitation i from Invitation where i.id = :candidateId";
        Query query =entityManager.createQuery(prepareQuery);
        query.setParameter("candidateId", candidate.getId());
        return query.getResultList();
                
    }

    @Override
    public Candidate getUserMail(String mail) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void save(Candidate object) {
        BasicUserDAO.super.save(object); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(Candidate object) {
        BasicUserDAO.super.delete(object); //To change body of generated methods, choose Tools | Templates.
    }
}
