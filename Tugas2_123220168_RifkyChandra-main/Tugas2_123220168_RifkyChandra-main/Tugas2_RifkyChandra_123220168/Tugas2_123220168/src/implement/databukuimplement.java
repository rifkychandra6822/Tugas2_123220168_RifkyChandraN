/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package implement;

import java.util.List;
import model.*;

/**
 *
 * @author Hp
 */
public interface databukuimplement {
    public void insert(databuku b);
    public void update(databuku b);
    public void delete(int id);
    public List<databuku> getAll();
}
