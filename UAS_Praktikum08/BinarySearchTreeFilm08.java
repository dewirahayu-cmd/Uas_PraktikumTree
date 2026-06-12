package UAS_Praktikum08;

public class BinarySearchTreeFilm08 {

    NodeFilm08 root;

    public BinarySearchTreeFilm08() {
        root = null;
    }
    
    // method isEmpty()
    public boolean isEmpty() {
        return root == null;
    }

    // method add() menambahkan film ke BST berdasarkan kodeFilm
    public void add(Film08 data) {
        NodeFilm08 newNode = new NodeFilm08(data);

        if (isEmpty()) {
            // tree masih kosong, node baru jadi root
            root = newNode;
        } else {
            NodeFilm08 current = root;
            NodeFilm08 parent  = null;

            while (true) {
                parent = current;

                // perbandingkan
                if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                    // masuk ke subtree kiri
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                        return;
                    }
                } else {
                    // masuk ke subtree kanan
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
    }

    // method find() mencari film berdasarkan kodeFilm
    public boolean find(String kodeFilm) {
        boolean result  = false; // false jika tidak ditemukan
        NodeFilm08 current = root;

        while (current != null) {
            if (kodeFilm.equals(current.data.kodeFilm)) {
                result = true;   // mengembalikan true jika ditemukan
                break;
            } else if (kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return result;
    }

    // method traverseInOrder()
    public void traverseInOrder(NodeFilm08 node) {
        if (node != null) {
            traverseInOrder(node.left);
            node.data.tampilInformasi();
            traverseInOrder(node.right);
        }
    }

    // method traversePreOrder() 
    public void traversePreOrder(NodeFilm08 node) {
        if (node != null) {
            node.data.tampilInformasi();
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    // method hitungJumlahFilm() 
    public int hitungJumlahFilm(NodeFilm08 node) {
        if (node == null) {
            return 0;
        }
        // Jumlah = 1 (node ini) + jumlah di subtree kiri + jumlah di subtree kanan
        return 1 + hitungJumlahFilm(node.left) + hitungJumlahFilm(node.right);
    }

    // method cariRatingTertinggi() 
    public Film08 cariRatingTertinggi(NodeFilm08 node) {
        if (node == null) {
            return null;
        }

        // ambil kandidat rating tertinggi dari subtree kiri dan kanan
        Film08 filmKiri   = cariRatingTertinggi(node.left);
        Film08 filmKanan  = cariRatingTertinggi(node.right);

        // mulai dengan film di node saat ini
        Film08 tertinggi = node.data;

        // bandingkan dengan hasil dari subtree kiri
        if (filmKiri != null && filmKiri.rating > tertinggi.rating) {
            tertinggi = filmKiri;
        }

        // bandingkan dengan hasil dari subtree kanan
        if (filmKanan != null && filmKanan.rating > tertinggi.rating) {
            tertinggi = filmKanan;
        }

        return tertinggi;
    }
}
    

