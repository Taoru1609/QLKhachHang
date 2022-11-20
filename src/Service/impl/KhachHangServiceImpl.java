/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.impl;

import DomainModels.KhachHangModel;
import Repository.KhachHangReposistory;
import Service.KhachHangService;
import ViewModels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author TUF
 */
public class KhachHangServiceImpl implements KhachHangService{

    @Override
    public List<KhachHangViewModel> getAll() {
        return KhachHangReposistory.getAllKH();
    }

    @Override
    public KhachHangModel getkhbyid(String id) {
       return KhachHangReposistory.getCTByMa(id);
    }

    @Override
    public int add(KhachHangModel n) {
        return KhachHangReposistory.add(n);
    }

    @Override
    public int update(KhachHangModel n) {
        return KhachHangReposistory.update(n);
    }

    @Override
    public int delete(String id) {
        return KhachHangReposistory.delete(id);
    }
    
}
