package SoftwareProcess.Shobshop.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import SoftwareProcess.Shobshop.Repository.UserRepository;

@Service
public class UserService{
    @Autowired
    UserRepository UserRepository;


}