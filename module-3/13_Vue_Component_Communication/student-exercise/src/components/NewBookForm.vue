<template>
   <form class="new-book-form" v-on:submit.prevent="saveBook">
       <div>
        <label for="title">Title:</label>
        <input class="title-input" type="text" name="Title" v-model="book.title" />
      </div>
      <div >
        <label for="author">Author:</label>
        <input class="author-input" type="text" name="author" v-model="book.author" />
      </div>
      <div>
       <label for="isbn">Isbn:</label>
        <input class="isbn-input" type="text" name="isbn" v-model="book.isbn" />
      </div>
<button type="submit" class="btn save">Save Book</button>
  
  </form>
  
</template>

<script>


export default {
     name: "new-book-form",
    
   
    data() {
        return {
            book: {
                title: '',
                author: '',
                read: false,
                isbn: ''
            }
        }
        },
    methods: {
        saveBook() {
            this.$store.commit('SAVE_BOOK', this.book);
            this.book = {
                title: '',
                author: '',
                read: false,
                isbn: ''
            };
        }
    }

}
</script>

<style>

.new-book-form {
    margin: 20px;
}
.new-book-form input, .new-book-form button {
    margin: 10px;
    font-size: 1rem;
}

</style>