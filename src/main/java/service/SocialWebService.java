package service;

import entity.common.SocialWebEntity;

import java.util.List;

/**
 * Created by Alex on 20.09.2015.
 */
public interface SocialWebService<T extends SocialWebEntity> {
    public void addData(T data);
    public void deleteData(T data);
    public void updateData(T data);
    public T getData(long id);
    public List<T> getListOfData();
}
