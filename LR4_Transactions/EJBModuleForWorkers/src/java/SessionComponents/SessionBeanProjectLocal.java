/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SessionComponents;

import Entities.Project;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author colya
 */
@Local
public interface SessionBeanProjectLocal{
    public List<Project> getAll();
    public List<Project> getExecuted();
}
