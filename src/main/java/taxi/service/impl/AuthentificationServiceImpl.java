package taxi.service.impl;

import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import taxi.exception.AuthentificationException;
import taxi.lib.Inject;
import taxi.lib.Service;
import taxi.model.Driver;
import taxi.service.AuthentificationService;
import taxi.service.DriverService;

@Service
public class AuthentificationServiceImpl implements AuthentificationService {
    private static final Logger logger = LogManager.getLogger((AuthentificationServiceImpl.class));
    @Inject
    private DriverService driverService;

    @Override
    public Driver login(String login, String password) throws AuthentificationException {
        logger.debug("method login was called with login: {}", login);
        Optional<Driver> driver = driverService.findByLogin(login);
        if (driver.isEmpty() || !driver.get().getPassword().equals(password)) {
            throw new AuthentificationException("Login or password was incorrect!");
        }
        return driver.get();
    }
}
