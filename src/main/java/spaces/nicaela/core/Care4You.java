package spaces.nicaela.core;


import org.umssdiplo.automationv01.core.bootstrap.customwebdriver.ManageDriver;
import org.umssdiplo.automationv01.core.bootstrap.utils.PropertyAccessor;
import org.umssdiplo.automationv01.core.bootstrap.utils.WebUrls;
import spaces.nicaela.web.department.DepartmentCreate;
import spaces.nicaela.web.department.DepartmentDelete;
import spaces.nicaela.web.department.DepartmentEdit;
import spaces.nicaela.web.department.DepartmentHome;
import spaces.nicaela.web.home.Home;

public final class Care4You {
    private Home home;
    private DepartmentHome departmentHome;
    private DepartmentCreate departmentCreate;
    private DepartmentEdit departmentEdit;
    private DepartmentDelete departmentDelete;

    private Care4You() {
        home = new Home();
        departmentHome = new DepartmentHome();
        departmentCreate = new DepartmentCreate();
        departmentEdit = new DepartmentEdit();
        departmentDelete = new DepartmentDelete();
    }

    public static Care4You init() {
        ManageDriver.getInstance().getWebDriver()
                .navigate().to(PropertyAccessor.getInstance().getBaseUrl(WebUrls.NICAELA));
        return new Care4You();
    }

    public Home getHome() {
        return home;
    }

    public DepartmentHome getDepartment() { return departmentHome; }

    public DepartmentCreate getDepartmentCreate() {
        return departmentCreate;
    }

    public DepartmentEdit getDepartmentEdit() {
        return departmentEdit;
    }
    public DepartmentDelete getDepartmentDelete() {
        return departmentDelete;
    }
}
