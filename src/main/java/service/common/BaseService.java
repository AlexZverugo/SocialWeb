package service.common;

        import dao.SocialWebDAO;
        import entity.common.SocialWebEntity;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.transaction.annotation.Transactional;
        import service.SocialWebService;


@Service("socialWebService")
public abstract class BaseService<T extends SocialWebEntity> implements SocialWebService<T> {

    @Autowired
    SocialWebDAO socialWebDAO;

    public SocialWebDAO getSocialWebDAO() {
        return socialWebDAO;
    }

    public void setSocialWebDAO(SocialWebDAO socialWebDAO) {
        this.socialWebDAO = socialWebDAO;
    }

    @Transactional
    public void addData(T data){
        socialWebDAO.addData(data);
    }

    @Transactional
    public void deleteData(T data) {
        socialWebDAO.deleteData(data);
    }

    @Transactional
    public void updateData(T data) {
        socialWebDAO.updateData(data);
    }
}
