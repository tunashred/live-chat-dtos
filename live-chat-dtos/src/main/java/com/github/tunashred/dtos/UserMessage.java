package com.github.tunashred.dtos;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserMessage {
    String username;
    String message;

    static public String serialize(UserMessage userMessage) throws JsonProcessingException {
        ObjectMapper writer = new ObjectMapper();
        return writer.writeValueAsString(userMessage);
    }

    static public UserMessage deserialize(String userMessageSerialized) throws JsonProcessingException {
        ObjectMapper reader = new ObjectMapper();
        return reader.readValue(userMessageSerialized, UserMessage.class);
    }
}
