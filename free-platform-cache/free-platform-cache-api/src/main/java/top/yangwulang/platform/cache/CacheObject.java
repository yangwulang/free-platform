package top.yangwulang.platform.cache;

public record CacheObject<K, V>(K key, V value) {
}