//package com.cloud.fall.mountains.notebook.compare;
//
//import java.util.HashSet;
//import java.util.Map;
//import java.util.Set;
//
//public class YamlKeys {
//
//    private static Set<String> keys = new HashSet<>();
//    private static String path = "";
//
//    YamlKeys(Map<?, ?> data) {
//        getKeysRecursive(data);
//    }
//
//    private void getKeysRecursive(final Map<?, ?> data) {
//        for (Object key : data.keySet()) {
//            final Object value = data.get(key);
//            if (key instanceof String) {
//                if (path.isEmpty()) {
//                    path = (String) key; // If the key is the first on the path, don't include separator.
//                } else {
//                    path = path + "." + (String) key; // Here is the separator, you can change it.
//                }
//            }
//            if (value instanceof Map) {
//                getKeysRecursive((Map<?, ?>) value); // A value map has been found, recursing with that value.
//            } else {
//                keys.add(path); // No more maps have been found, we can add the path and stop recursing.
//                if (path.contains(".")) {
//                    path = path.substring(0, path.lastIndexOf(".")); // Removing last key, so if a value contains more than one key, it won't appear again.
//                }
//            }
//        }
//        path = ""; // This is important, reset the path.
//    }
//
//    Set<String> getKeys() {
//        return keys;
//    }
//}
