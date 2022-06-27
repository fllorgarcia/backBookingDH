//package com.example.piG1.Service;
//
//import com.example.piG1.Model.DTO.BookingDTO.BookingDTO;
//import com.example.piG1.Model.DTO.UserDTO.UserBasicDTO;
//import com.example.piG1.Model.Entity.Booking;
//import com.example.piG1.Model.Entity.User;
//import com.example.piG1.Repository.IBookingRepository;
//import com.example.piG1.Repository.IUserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//
//import java.util.ArrayList;
//
//public class AuthenticationServices implements UserDetailsService {
//
//    @Autowired
//    private IUserRepository userRepository;
//    @Autowired
//    private IBookingRepository bookingRepository;
//
//    @Override
//    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//        User user = userRepository.findByUserName(username);
//        if (user == null) {
//            throw new UsernameNotFoundException("User not found with username: " + username);
//        }
//        return new org.springframework.security.core.userdetails.User(user.getMail(), user.getPassword(),
//                new ArrayList<>());
//    }
//
////    public Booking createReservation(BookingDTO bookingDTO) {
////
////        Booking newReservation = new Booking();
////        newReservation.setStartTime(reservation.getStartTime());
////        newReservation.setStartDate(reservation.getStartDate());
////        newReservation.setFinalDate(reservation.getFinalDate());
////        newReservation.setUser(reservation.getUser());
////        newReservation.setProduct(reservation.getProduct());
////        return bookingRepository.save(newReservation);
////
////    }
//
//
//    public User createUser(UserBasicDTO userBasicDTO){
//        User newUser = new User();
//        newUser.setName(userBasicDTO.getName());
//        newUser.setLastName(userBasicDTO.getLastName());
//        newUser.setMail(userBasicDTO.getMail());
//        newUser.setPassword(userBasicDTO.getPassword());
//        newUser.setRole(userBasicDTO.getRole());
//        return userRepository.save(newUser);
//    }
//}
