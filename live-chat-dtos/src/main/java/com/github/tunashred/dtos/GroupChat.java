package com.github.tunashred.dtos;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.Objects;

@FieldDefaults(level = AccessLevel.PRIVATE)
@NoArgsConstructor
@Data
public class GroupChat {
    String chatName;
    String chatID;

    public GroupChat(String chatName) {
        this.chatName = chatName;
        this.chatID = DigestUtils.sha256Hex(this.chatName);
    }
}
