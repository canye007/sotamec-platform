public class UserRepository {
    
}
package com.sotamec.user.repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}