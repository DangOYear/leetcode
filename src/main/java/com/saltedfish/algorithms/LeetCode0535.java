package com.saltedfish.algorithms;

import java.util.HashMap;
import java.util.Map;

public class LeetCode0535 {

    public class Codec {
        Map<String, String> encode;
        Map<String, String> decode;
        {
            encode = new HashMap<>();
            decode = new HashMap<>();
        }
        // Encodes a URL to a shortened URL.
        public String encode(String longUrl) {
            encode.put(longUrl, Integer.valueOf(longUrl.hashCode()).toString());
            decode.put(Integer.valueOf(longUrl.hashCode()).toString(), longUrl);
            return Integer.valueOf(longUrl.hashCode()).toString();
        }

        // Decodes a shortened URL to its original URL.
        public String decode(String shortUrl) {
            return decode.get(shortUrl);
        }
    }

// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));
}
