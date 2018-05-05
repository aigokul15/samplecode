Vue.component(
    'simple-counter', {
        template : '<button v-on:click="counter +=1">{{counter}}</button>',
        data : function(){
            return data;
        }
})

new Vue({

    el : '#component',

    data : {
        counter : 0,
    } 

})