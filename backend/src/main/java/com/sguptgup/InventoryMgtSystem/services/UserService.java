package com.sguptgup.InventoryMgtSystem.services;

import com.sguptgup.InventoryMgtSystem.dtos.LoginRequest;
import com.sguptgup.InventoryMgtSystem.dtos.RegisterRequest;
import com.sguptgup.InventoryMgtSystem.dtos.Response;
import com.sguptgup.InventoryMgtSystem.dtos.UserDTO;
import com.sguptgup.InventoryMgtSystem.models.User;

public interface UserService {
    Response registerUser(RegisterRequest registerRequest);

    Response loginUser(LoginRequest loginRequest);

    Response getAllUsers();

    User getCurrentLoggedInUser();

    Response getUserById(Long id);

    Response updateUser(Long id, UserDTO userDTO);

    Response deleteUser(Long id);

    Response getUserTransactions(Long id);
}
