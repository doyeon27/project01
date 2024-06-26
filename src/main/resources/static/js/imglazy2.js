const io2 = new IntersectionObserver(entries => {
    entries.forEach(entry => {
        if (entry.intersectionRatio > 0) {
            if ( entry.target.attributes.mysrc )
            {
                fetch("/api/loadImg/"+entry.target.attributes.mysrc.value )
                    .then(resp => resp.text())
                    .then(data =>{
                        if ( data ) {
                            entry.target.setAttribute("src", 'data:image/jpeg;base64,' + data);
                            entry.target.removeAttribute("mysrc")
                        }
                    });
            }
        }
    })
});
// (function(){
//     document.querySelectorAll( "img[mysrc]" ).forEach( e=>io2.observe(e))
// })();