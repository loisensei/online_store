package com.ltw.online_store.Service;

import com.ltw.online_store.Entity.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    Set<Role> getRoleAdmins();
    Set<Role> getRoleUsers();

    List<Role> getAll();
}
