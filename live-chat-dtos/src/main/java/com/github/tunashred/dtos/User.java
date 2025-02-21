package com.github.tunashred.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.commons.codec.digest.DigestUtils;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
public class User {
    String name;
    String userID;

    public User(String chatName) {
        this.name = chatName;
        this.userID = DigestUtils.sha256Hex(this.name);
    }
}
