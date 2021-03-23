<template>
  <div class = "main">
<h2>Product Reviews for {{name}}</h2>
<p class = "description"> {{description}} </p>
      </div>
</template>

<script>
export default {
 name: 'product-review',
 data(){
     return {
         pname: 'Cigar Parties For Dummies',
         description: 'Host and plan squirrel parties'
         
     }
 }
}
</script>

<style>

</style>