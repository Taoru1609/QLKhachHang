/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import DomainModels.KhachHangModel;
import ViewModels.KhachHangViewModel;
import java.util.List;

/**
 *
 * @author TUF
 */
public interface KhachHangService {
    List<KhachHangViewModel> getAll();

    KhachHangModel getkhbyid(String id);

    int add(KhachHangModel n);

    int update(KhachHangModel n);

    int delete(String id);

}
