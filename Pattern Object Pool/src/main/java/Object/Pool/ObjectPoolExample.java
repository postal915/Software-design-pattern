package Object.Pool;

import java.util.LinkedList;
import java.util.List;

public class ObjectPoolExample {
    public static void main(String[] args) {
        ObjectPool objectPool = new ObjectPool();
        PooledObject pooledObject = objectPool.getPooledObject();
        objectPool.releasedPooledObject(pooledObject);

    }
}

class PooledObject {
}

class ObjectPool {
    List<PooledObject> free = new LinkedList<>();
    List<PooledObject> used = new LinkedList<>();

    public PooledObject getPooledObject() {
        if (free.isEmpty()) {
            PooledObject pooledObject = new PooledObject();
            free.add(pooledObject);
            return pooledObject;
        } else {
            PooledObject pooledObject = free.get(0);
            used.add(pooledObject);
            free.remove(pooledObject);
            return pooledObject;
        }

    }

    public void releasedPooledObject(PooledObject pooledObject) {
        used.remove(pooledObject);
        free.add(pooledObject);

    }
}
