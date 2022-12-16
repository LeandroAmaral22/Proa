$('#quiz').quiz({
  //resultsScreen: '#results-screen',
  //counter: false,
  //homeButton: '#custom-home',
  counterFormat: 'Question %current of %total',
  questions: [
    {
      'q': 'Bacon ipsum dolor amet porchetta kevin filet mignon?',
      'options': [
        'Yes',
        'No'
      ],
      'correctIndex': 0,
      'correctResponse': 'Correct! Spare ribs salami sirloin short ribs capicola.',
      'incorrectResponse': 'Incorrect! Spicy jalapeno venison cupim shankle picanha.'
    },
    {
      'q': 'Bacon ham tenderloin pork belly pork chop bresaola pancetta?',
      'options': [
        'Steak',
        'Ribs',
        'Sirloin'
      ],
      'correctIndex': 2,
      'correctResponse': 'Correct! Bresaola venison picanha, brisket t-bone tenderloin salami jowl chicken landjaeger.',
      'incorrectResponse': 'Incorrect! Kevin bresaola meatball ball tip ground round.'
    },
    {
      'q': 'Corned beef hamburger alcatra biltong, beef ribs flank brisket?',
      'options': [
        'True',
        'False'
      ],
      'correctIndex': 0,
      'correctResponse': 'Correct! Bacon meatloaf beef porchetta jerky t-bone pastrami.',
      'incorrectResponse': 'Incorrect! Pork loin fatback shankle.'
    },
    {
      'q': 'Picanha meatball tenderloin burgdoggen cow jowl?',
      'options': [
        'Sausage',
        'Tenderloin',
        'Picanha'
      ],
      'correctIndex': 2,
      'correctResponse': 'Correct! Jowl frankfurter burgdoggen turkey, porchetta strip steak landjaeger jerky.',
      'incorrectResponse': 'Incorrect! Swine andouille ground round, short ribs short loin.'
    }
  ]
});