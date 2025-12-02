package builders;

import Pojo.PostPetStoreUser;

public class PetStoreUserGenerator {
    public static PostPetStoreUser setUserData(){
        return PostPetStoreUser
                .builder()
                .firstName("Mikhail")
                .lastName("Polovinko")
                .password("1233456")
                .userStatus(1)
                .phone("9999999999")
                .id(8761234)
                .email("mpolovinko@mail.ru")
                .username("aqauser")
                .build();

    }
}
