if [ "$TRAVIS_PULL_REQUEST" == "false" ]; then
  echo -e "Starting to update gh-pages\n"
  pwd
  ls -l 
  #copy data we're interested in to other place
  mkdir -p $HOME/tests
  cp -R modules/eeuser/build/reports $HOME/tests/eeuser
  cp -R modules/minigl/build/reports $HOME/tests/minigl

  #go to home and setup git
  cd $HOME
  git config --global user.email "travis@travis-ci.org"
  git config --global user.name "Travis"

  #using token clone gh-pages branch
  git clone --quiet --branch=gh-pages https://${GH_TOKEN}@github.com/jpos/jPOS-EE.git gh-pages > /dev/null 2>&1

  #go into diractory and copy data we're interested in to that directory
  cd gh-pages
  cp -Rf $HOME/tests/* .

  #add, commit and push files
  git add -f .
  git commit -m "Travis build $TRAVIS_BUILD_NUMBER pushed to gh-pages"
  git push -fq origin gh-pages > /dev/null

  echo -e "Done updating gh-pages\n"
fi

