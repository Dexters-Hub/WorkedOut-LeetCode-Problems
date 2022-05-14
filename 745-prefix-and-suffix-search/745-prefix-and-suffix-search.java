class WordFilter {
    Trie trie;

    public WordFilter(String[] words) {
        trie = new Trie();
        for (int i = 0; i < words.length; i++) {
            
            StringBuilder key = new StringBuilder("{").append(words[i]);
            trie.insert(key.toString(), i);
            for (int j = 0; j < words[i].length(); j++) {
                key.insert(0, words[i].charAt(words[i].length() - j - 1));
                trie.insert(key.toString(), i);
            }
        }
    }

    public int f(String prefix, String suffix) {
        String key = suffix + '{' + prefix;
        return trie.prefixNumber(key);
    }

    class TrieNode {
        public TrieNode[] child;
        public int rank;

        public TrieNode() {
            this.child = new TrieNode[27];
            this.rank = -1;
        }
    }

    class Trie {
        private TrieNode root;

        public Trie() {
            root = new TrieNode();
        }

        public void insert(String word, int rank) {
            if (word == null) {
                return;
            }
            char[] chars = word.toCharArray();
            TrieNode currNode = root;
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                index = chars[i] - 'a';
                if (currNode.child[index] == null) {
                    currNode.child[index] = new TrieNode();
                }
                currNode = currNode.child[index];
                currNode.rank = rank;
            }
        }

        public int prefixNumber(String prefix) {
            if (prefix == null) {
                return 0;
            }
            char[] chars = prefix.toCharArray();
            TrieNode currNode = root;
            int index = 0;
            for (int i = 0; i < chars.length; i++) {
                index = chars[i] - 'a';
                if (currNode.child[index] == null) {
                    return -1;
                }
                currNode = currNode.child[index];
            }
            return currNode.rank;
        }
    }
}