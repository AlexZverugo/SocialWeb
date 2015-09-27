package dao;

import entity.common.SocialWebEntity;

import java.util.List;

/**
 * Created by Alex on 19.09.2015.
 */
public interface SocialWebDAO <T extends SocialWebEntity> {
    public void addData(T data);
    public void deleteData(T data);
    public void updateData(T data);
    public T getData(long id);
    public List<T> getListOfData();
}
