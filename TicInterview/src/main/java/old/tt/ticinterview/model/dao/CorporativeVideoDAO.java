package old.tt.ticinterview.model.dao;

import com.tt.ticinterview.beans.video.CorporativeVideo;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

/**
 * Created by Tictum on 13/03/2017.
 */
@Repository("CorporativeVideoDAO")
public class CorporativeVideoDAO implements VideoDAO<CorporativeVideo> {
    @Override
    public CorporativeVideo getById(Long id) {
        return entityManager.find(CorporativeVideo.class, id);
    }

    @Override
    public List<CorporativeVideo> getAll() {
        String prepareQuery = "select something from CorporativeVideo something";
        Query query = entityManager.createQuery(prepareQuery);
        return query.getResultList();
    }

    @Override
    public List<CorporativeVideo> searchVideo(String nombreVideo) {
        String sql = "Select cosa from CorporativeVideo cosa where cosa.name like :nombre";
        Query query = entityManager.createQuery(sql);
        query.setParameter("nombre", "%"+nombreVideo+"%");
        return query.getResultList();
    }
}
