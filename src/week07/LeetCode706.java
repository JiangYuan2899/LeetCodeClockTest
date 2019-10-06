package week07;

public class LeetCode706 {
	private static final int DEFAULT_CAPACITY = 16;
    private static final float DEFAULT_LOAD_FACTOR = 0.75f;

    private int size;
    private int capacity;
    private float factor; // loadFactor�Ǹ������ӣ���ʾ������table��ռ�õĳ̶ȣ���һ����������Ĭ��Ϊ0.75
    private int threshold; // threshold��ʾ��ֵ������ֵ�Ը���size���ڵ���thresholdʱ���ǽ�����չ��һ����ԣ�threshold����table.length����loadFactor

    private Node[] table;

    @SuppressWarnings("unchecked")
    public void MyHashMap(int capacity, float factor) {
    	
        public void MyHashMap() {
            this(DEFAULT_CAPACITY, DEFAULT_LOAD_FACTOR);
        }
        if (capacity <= 0) {
            capacity = DEFAULT_CAPACITY;
        }
        if (factor <= 0) {
            factor = DEFAULT_LOAD_FACTOR;
        }

        // Ϊ�˷��㣬���������������������

        // ��ȡ>=capacity��2���ݴη�ֵ
        int minimumCapacity = 1;
        capacity -= 1;
        while (capacity != 0) {
            capacity >>= 1;
            minimumCapacity <<= 1;
        }
        capacity = minimumCapacity;

        this.factor = factor;
        this.capacity = capacity;
        this.threshold = (int) (capacity * factor);

        this.table = new Node[this.capacity];
    }
    private class Node {
        private int key;
        private int value;
        private Node next;

        Node(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }


    private int hash(Object key) {
        if (key == null) {
            return 0;
        }
        int hashCode = key.hashCode();
        // ��λ���� h = key.hashCode()Ϊ32λ������32λ�ĸ�16λ�ڵ�16λ����������㣬�Ǹߵ�bit����������
        return hashCode ^ (hashCode >>> 16);
    }

    public void put(int key, int value) {
        ensureCapacity();

        int pos = getPos(key, table);
        if (table[pos] == null) { // Ͱ��δ������
            Node node = new Node(key, value);
            table[pos] = node;
            size++;
        } else {
            Node head = table[pos]; // ȡ��ͷ�ڵ�
            Node tmp = head;
            while (tmp != null) {
                if (key == tmp.key) {
                    tmp.value = value; // ���Ǵ�key��Ӧ��value
                    break;
                }
                tmp = tmp.next;
            }
            if (tmp == null) { // tmpΪnull˵����ϣ��ײ�ˣ�Ͱ�л�û�д˼�ֵ��
                Node node = new Node(key, value); // ���½ڵ���뵽����ͷ��
                node.next = head;
                table[pos] = node;
                size++;
            }
        }
    }

    @SuppressWarnings("unchecked")
    private void ensureCapacity() {
        if (size >= threshold) { // ��ֵ������������ֵʱ����Ҫ����
            // ȡ��Ͱ�е���������ڵ㣬Ȼ�����¼���λ�ã��ٷ������ݺ��Ͱ��

            capacity <<= 1; // ������������
            threshold = (int) (capacity * factor);// ���¼�����ֵ

            Node[] newTable = new Node[capacity];
            for (Node node : table) {
                Node tmp = node; // ȡ��ԭ�����ͷ�ڵ�
                while (tmp != null) { // �ǵ�����ÿ���㶼Ҫ����λ��
                    int pos = getPos(tmp.key, newTable); // ������ڵ��������λ��

                    Node next = tmp.next;

                    tmp.next = newTable[pos];
                    newTable[pos] = tmp;

                    tmp = next;
                }
            }
            table = newTable;
        }
    }

    // ���key���ڵ�Ͱ��λ��
    private int getPos(Object key, Node[] table) {
        // lengthΪ2���ݴη���h & (length-1)��ͬ����ģ���㣺h % length
        return hash(key) & (table.length - 1);
    }

    public int get(int key) {
        int pos = getPos(key, table);
        if (table[pos] == null) { // û�з��ִ˼�
            return -1;
        } else { // ���ܴ��ڹ�ϣ��ײ
            Node head = table[pos]; // ȡ��ͷ�ڵ�
            while (head != null) {
                if (key == head.key) {
                    return head.value;
                }
                head = head.next;
            }
            return -1;
        }
    }

    public void remove(int key) {
        int pos = getPos(key, table);

        if (table[pos] == null) { // û�з��ִ˼�
            return;
        } else {
            Node head = table[pos]; // ȡ��ͷ�ڵ�
            Node preNode = null;
            while (head != null) {
                if (key == head.key) {
                    break;
                }
                preNode = head;
                head = head.next;
            }
            if (head != null) { // �ҵ���ɾ���Ľڵ�
                Node next = head.next;
                head.next = null;
                if (preNode == null) { // ɾ���Ľڵ���ͷ�ڵ�����
                    table[pos] = next;
                } else {
                    preNode.next = next;
                }
                size--;
            }
        }
    }

    public int size() {
        return size;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (Node node : table) {
            Node tmp = node;
            sb.append("(");
            while (tmp != null) {
                sb.append("{").append(tmp.key).append(":").append(tmp.value).append("},");
                tmp = tmp.next;
            }
            sb.append(")");
        }
        sb.append("]����СΪ��").append(size());
        return sb.toString();
    }
}
