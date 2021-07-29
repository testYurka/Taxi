package taxi.service;

import java.util.Optional;
import taxi.exception.AuthentificationException;
import taxi.lib.Inject;
import taxi.lib.Injector;
import taxi.lib.Service;
import taxi.model.Driver;

@Service
public class AuthentificationServiceImpl implements AuthentificationService {
    private Injector injector = Injector.getInstance("taxi");
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthentificationException {
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            throw new AuthentificationException("Login or password was incorrect!");
        }
        return driver.get();
    }
}
