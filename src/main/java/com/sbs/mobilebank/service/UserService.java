package com.sbs.mobilebank.service;

import com.sbs.mobilebank.entities.UserEntity;
import com.sbs.mobilebank.entities.Users;
import com.sbs.mobilebank.exception.*;
import com.sbs.mobilebank.shared.dto.UserDTO;
import com.sun.xml.internal.messaging.saaj.packaging.mime.MessagingException;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

public interface UserService {

    Users register(String firstName, String lastName, String username, String email) throws UserNotFoundException, UsernameExistException, EmailExistException, MessagingException, javax.mail.MessagingException;

    List<Users> getUsers();

    Users findUserByUsername(String username);

    Users findUserByEmail(String email);

    Users addNewUser(String firstName, String lastName, String username, String email, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

    Users updateUser(String currentUsername, String newFirstName, String newLastName, String newUsername, String newEmail, String role, boolean isNonLocked, boolean isActive, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;

    //void deleteUser(String username) throws IOException;
    void deleteUser(Long id);

    void resetPassword(String email) throws MessagingException, EmailNotFoundException, javax.mail.MessagingException;

    Users updateProfileImage(String username, MultipartFile profileImage) throws UserNotFoundException, UsernameExistException, EmailExistException, IOException, NotAnImageFileException;



    //Get list of all teachers
    public List<UserEntity> getAllUsers();
    UserDTO createUser(UserDTO userDTO);
    UserDTO getUser(String userEmail);
    UserDTO getUserByUserId(String userId);
    UserDTO updateUser(String userCode , UserDTO user);
    //void deleteUser(String userCode);
}
