/*
 * Twitter Backend - Moo: Twitter Clone Application Backend by Scaler
 * Copyright © 2021 Subhrodip Mohanta (hello@subho.xyz)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package xyz.subho.clone.twitter.service.impl;

import java.util.List;
import java.util.UUID;
import org.springframework.stereotype.Service;
import xyz.subho.clone.twitter.entity.Users;
import xyz.subho.clone.twitter.model.UserModel;
import xyz.subho.clone.twitter.service.UserService;

@Service
public class UserServiceImpl implements UserService {

  @Override
  public UserModel getUserByUserName(String username) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserModel getUserByUserId(UUID userId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public Users getUserEntityByUserId(UUID userId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserModel addUser(UserModel user) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public UserModel editUser(UserModel user) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public boolean addFollower(UUID followerId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public boolean removeFollower(UUID followerId) {
    // TODO Auto-generated method stub
    return false;
  }

  @Override
  public List<UserModel> getFollowers(UUID userId) {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public List<UserModel> getFollowings(UUID userId) {
    // TODO Auto-generated method stub
    return null;
  }
}
